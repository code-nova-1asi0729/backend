# Contributing to Vigilia Platform API

## Branching model

We use GitFlow:

- `main`: released versions only.
- `develop`: integration branch.
- `feature/<name>`: new work, created from `develop`.
- `release/x.y.z`: release preparation, created from `develop`.
- `hotfix/x.y.z`: urgent fixes, created from `main`.

## Commit messages

We follow [Conventional Commits](https://www.conventionalcommits.org/) in English, for example `feat(buildings): add building aggregate root`.

## Pull requests

Open pull requests against `develop`. Keep them small and describe what changed.

## Versioning

We use [Semantic Versioning](https://semver.org/).